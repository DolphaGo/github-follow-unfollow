package me.dolphago.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Followings extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    @Builder
    public Followings(Long github_id, String github_login) {
        super(github_id, github_login);
    }
}
