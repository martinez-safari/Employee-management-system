/*Leave.java
 Entity for Leave
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */


package za.ac.cput.entity;

public class Leave {
    private int daysOfLeave;
    private String  leaveId;

    private Leave(){}

    private Leave(Leave.Builder builder){
        this.daysOfLeave= builder.daysOfLeave;
        this.leaveId= builder.leaveId;

    }


    public  int getdaysOfLeave() {
        return daysOfLeave;
    }

    public void setdaysOfLeave(int daysOfLeave) {
        this.daysOfLeave = daysOfLeave;
    }

    public String getleaveId() {
        return leaveId;
    }

    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId;
    }



    @Override
    public String toString() {
        return "Leave{" +
                "daysOfLeave='" + daysOfLeave + '\'' +
                ",leaveId='" + leaveId+
                '}';
    }
    public static class Builder{

        private int daysOfLeave;
        private String leaveId;



        public Leave.Builder setdaysOfLeave(int daysOfLeave) {
            this.daysOfLeave = daysOfLeave;
            return this;
        }


        public Leave.Builder setleaveId(String leaveId) {
            this.leaveId= leaveId;
            return this;
        }


        public Leave.Builder copy(Leave leave) {
            this.daysOfLeave = leave.daysOfLeave;
            this.leaveId = leave.leaveId;

            return this;
        }
        public Leave build(){
            return new Leave(this);
        }
    }
}



