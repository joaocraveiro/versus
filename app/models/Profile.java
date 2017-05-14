package models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.ebean.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
public class Profile extends Model {

    @Id
    @GeneratedValue
    public Long id;

    String name;

    public Profile(String name){
        this.name = name;
        this.save();
    }

    public static Finder<Long,Profile> find = new Finder<>(Profile.class);

}
