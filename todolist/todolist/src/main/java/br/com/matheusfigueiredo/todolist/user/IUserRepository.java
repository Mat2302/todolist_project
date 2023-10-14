package br.com.matheusfigueiredo.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserModel, UUID>{ //classe que o UserRepository está "puxando" e variavel do Id do Model.
    UserModel findByUsername(String username);
}
