package ua.junior.remindme.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by lenin on 22.03.2016.
 */

@Entity
@Table(name = "direction")
public class Direction {

        @Id
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        private long id;

        @Column(name = "text", nullable = false, length = 100)
        private String name;


    }
