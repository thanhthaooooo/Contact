package com.example.model;

public class DanhBa {
    private String Id;
    private String Name;
    private String NumberPhone;

    public DanhBa () {
    }

    public DanhBa(String id, String name, String numberPhone) {
        Id = id;
        Name = name;
        NumberPhone = numberPhone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumberPhone() {
        return NumberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        NumberPhone = numberPhone;
    }
}
