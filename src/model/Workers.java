package model;
public class Workers {
    private int ID;
    private String Family;
    private String Name;
    private String Patronymic;
    private String Telephone;
    private String Status;
    
    public int getId(){
        return ID;
    }
    public void setId(int ID){
        this.ID = ID;
    }
    public String getFamily(){
        return Family;
    }
    public void setFamily(String Family){
        this.Family = Family;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getPatronymic(){
        return Patronymic;
    }
    public void setPatronymic(String Patronymic){
        this.Patronymic = Patronymic;
    }
    public String getTelephone(){
        return Telephone;
    }
    public void setTelephone(String Telephone){
        this.Telephone = Telephone;
    }
    public String getStatus(){
        return Status;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }
    @Override
    public String toString(){
        return "Worker {" + 
                "id = " + ID +
                " Family = " + Family +
                " Name = " + Name +
                " Patronimic = " + Patronymic + 
                " Telephone = " + Telephone + 
                " Status = " + Status + "}";
    }
    public Object[] toArray(){
        return new Object[] {ID, Family, Name, Patronymic, Telephone, Status};
    }
}
