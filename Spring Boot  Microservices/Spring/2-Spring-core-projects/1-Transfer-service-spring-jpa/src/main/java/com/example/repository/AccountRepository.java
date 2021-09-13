
package com.example.repository;

import com.example.model.Account;

public interface AccountRepository {

    Account load(String number);

    void update(Account account);

}