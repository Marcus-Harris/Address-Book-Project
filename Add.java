package com.tts;

public class Add extends AddressBook {

    public Add(int ID, String firstName, String lastName, int phoneNumber, String emailAddress) {
        super(ID, firstName, lastName, phoneNumber, emailAddress);


    AddressBook addressBook = new AddressBook(ID, firstName, lastName, phoneNumber, emailAddress);
    addressBook.ourAddressBook.put(ID,
    }
}
