package com.new3tious.new3app.dao;

import com.new3tious.new3app.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getName(),user.getFavoriteIngredients(),user.getAllergies(), user.getOnDiet()));
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteUserById(UUID id) {
        Optional<User> optionalUser = selectUserById(id);
        if(optionalUser.isPresent()){
            DB.remove(optionalUser.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User updatedUser) {
        return selectUserById(id)
                .map(user -> {
                    int indexOfPersonToUpdate = DB.indexOf(user);
                    if(indexOfPersonToUpdate >= 0){
                        DB.set(indexOfPersonToUpdate, new User(id, updatedUser.getName(), updatedUser.getFavoriteIngredients()
                        , updatedUser.getAllergies(), updatedUser.getOnDiet()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
