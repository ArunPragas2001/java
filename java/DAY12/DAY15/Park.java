class Vehicle{
       // define private fields;
    private String LicensePlate;
    private String OwnerName;
    private int Parked;

       // constructor
    vehicle(String LicensePlate,String OwnerName,int hoursparked ){
     this.LicensePlate=LicensePlate;
     this.OwnerName=OwnerName;
     this hoursparked=hoursparked;
             
       }
   
   //getters
       public String getLicenseplate()
       {
            return LicensePlate;
       }

        public String getOwnerName()
       {
            return OwnerName;
       }
        
        public int getHoursParked()
        {
            return hoursparked;
        }


       //setters

       public void setLicenseplate(String LicencePlate)
       {
        this.LicencePlate=LicensePlate;
       }
       
       public void setOwnerName(String OwnerName)
       {
        this.OwnerName=OwnerName;
       } 

       public void setHoursParked(int  hoursparked)
        {

            this.hoursparked=hoursparked;
        }



}

class ParkingLot{
    
    private Vehicle vehi[];
    private int VehiCount=0;

    vehi[] vehicles=new vehi[5];


}