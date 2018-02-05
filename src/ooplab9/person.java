package ooplab9;

public class person {
    private String name;
    private String personid;
    private Address address;
    private Job job;

    public person(String name, String personid, Address address, Job job) {
        this.name = name;
        this.personid = personid;
        this.address = address;
        this.job = job;
    }

    //tostring
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid='" + personid + '\'' +
                ", Address=" + address +
                ", job=" + job +
                '}';
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}