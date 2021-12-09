package Lab.Collections.src;

// POC Plain Old Class
public class Person { // entity
    private String personID; // ORM Object Relational Mappers
    private String fn;
    private String mn;
    private String ln;
    private String ssn;


    //getters and setters

    public String getPersonID() { 
        return this.personID;
    }

    public void setPersonID(String personID) { 
        this.personID = personID;
    }

    public String getFn() { 
        return this.fn;
    }

    public void setFn(String fn) { 
        this.fn = fn;
    }

    public String getMn() { 
        return this.mn;
    }

    public void setMn(String mn) { 
        this.mn = mn;
    }

    public String getLn() { 
        return this.ln;
    }

    public void setLn(String ln) { 
        this.ln = ln;
    }

    public String getSsn() { 
        return this.ssn;
    }

    public void setSsn(String ssn) { 
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person [fn=" + fn + ", ln=" + ln + ", mn=" + mn + ", personID=" + personID + ", ssn=" + ssn + "]";
    }

    
}
