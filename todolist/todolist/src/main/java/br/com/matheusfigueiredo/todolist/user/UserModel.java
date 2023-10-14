package br.com.matheusfigueiredo.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // getter e setters automáticos - Getter e Setter
@Entity(name = "tb_users")
public class UserModel {

    // @Getter
    // Também funciona para atributo específico
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Column(name = "usuario") atributo username com o nome no BD usuario
    @Column(unique = true) //username 'unico'
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
