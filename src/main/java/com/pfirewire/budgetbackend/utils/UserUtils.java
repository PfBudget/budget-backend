package com.pfirewire.budgetbackend.utils;

import com.pfirewire.budgetbackend.models.User;
import com.pfirewire.budgetbackend.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

    public static String currentUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    public static User currentUser(UserRepository userDao) {
        return userDao.findByUsername(currentUsername());
    }

}
