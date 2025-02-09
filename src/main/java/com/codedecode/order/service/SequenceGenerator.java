package com.codedecode.order.service;

import com.codedecode.order.entity.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;


@Service
public class SequenceGenerator {

    @Autowired
    private MongoOperations mongoOperations;

    public Integer generateNextOrderId(){
        Sequence counter = mongoOperations.findAndModify(
                Query.query(where("_id").is("sequence")),
                new Update().inc("sequence", 1),
                options().returnNew(true).upsert(true),
                Sequence.class);

        if (counter != null){
            return counter.getSequence();
        }
        return null;
    }


}
