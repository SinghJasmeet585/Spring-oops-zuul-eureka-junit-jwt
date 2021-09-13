package com.niit.ibm;

import java.util.HashMap;

public interface ClientInterface {
    void saveClientDetails(Client client);
    Client searchClientPassport(String passport);
}
