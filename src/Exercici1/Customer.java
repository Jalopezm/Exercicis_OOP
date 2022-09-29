package Exercici1;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        if (!member) {
            this.memberType = "null";
        } else {
            this.member = member;
        }
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) throws CustomerError {
        switch (memberType) {
            case "Premium", "Gold", "Silver":
                this.memberType = memberType;
                member = true;
                break;
            default:
                this.memberType = "";
                member = false;
                throw new CustomerError();
        }
    }

    @Override
    public String toString() {
        return "Customer {" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}