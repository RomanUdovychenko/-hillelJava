public class StudentGroup {
    private static int count=0;
    private String[] firstName=new String[count];
    private String[] lastName=new String[count];
    private int[] group=new int[count];

    private int[] rating=new int[count];
    private int[] attendance=new int[count];

    private void addItion(){
        count++;

        String[] firstName=new String[count];
        String[] lastName=new String[count];
        int[] group=new int[count];
        int[] rating=new int[count];
        int[] attendance=new int[count];

        for(int i=0;i<(count-1);i++){
            firstName[i]=this.firstName[i];
            lastName[i]=this.lastName[i];
            group[i]=this.group[i];
            rating[i]=this.rating[i];
            attendance[i]=this.attendance[i];
        }

        this.firstName=new String[count];
        this.lastName=new String[count];
        this.group=new int[count];
        this.rating=new int[count];
        this.attendance=new int[count];

        for(int i=0;i<(count-1);i++){
            this.firstName[i]=firstName[i];
            this.lastName[i]=lastName[i];
            this.group[i]=group[i];
            this.rating[i]=rating[i];
            this.attendance[i]=attendance[i];
        }
    }

    public void print(){
      for (int i=0;i<count;i++){
          System.out.print("Name: "+this.firstName[i]+" "+this.lastName[i]+
                  "||group: "+ this.group[i]+
                  "|| rating:"+this.rating[i]+
                  "||attendance:"+this.attendance[i]);
          System.out.println();
      }
    }

    public void addStudent(String firstN,String lastN,int group,int rating,int attendence){
        addItion();
        this.firstName[count-1]=firstN;
        this.lastName[count-1]=lastN;
        this.group[count-1]=group;
        this.rating[count-1]=rating;
        this.attendance[count-1]=attendence;
    }

    public void dellStudent(String firsN,String lastN){
        for(int i=0;i<this.firstName.length;i++){
            if(this.firstName[i]==firsN && this.lastName[i]==lastN){
                this.firstName[i]=null;
                this.lastName[i]=null;
                this.group[i]=-1;
                this.rating[i]=-1;
                this.attendance[i]=-1;
                break;
            }else if(i==(this.firstName.length-1)){
                System.out.println("Student for Delete NOT FOUND");
            }
        }
    }

    public void contains(String lastN,int group){
        for(int i=0;i<this.lastName.length;i++){
            if(this.lastName[i]==lastN && this.group[i]==group){
                System.out.println("Student Found:");
                System.out.println("FirstName: "+this.firstName[i]+" Group: "+this.group[i]);
                break;
            }else if(i==(this.lastName.length-1)){
                System.out.println("Student Not Found");
            }
        }

    }

    public void clear(){
        for(int i=0;i<this.firstName.length;i++){
            this.firstName[i]=null;
            this.lastName[i]=null;
            this.group[i]=-1;
            this.rating[i]=-1;
            this.attendance[i]=-1;
        }
    }

    public void tream(){
        int tempCount=0;

        for(int i=0;i<count;i++){
            if(this.firstName[i]!=null){
                tempCount++;
            }
        }

        String[] firstName=new String[tempCount];
        String[] lastName=new String[tempCount];
        int[] group=new int[tempCount];
        int[] rating=new int[tempCount];
        int[] attendance=new int[tempCount];

            for(int j=0,i=0;j<count;j++){
                if(this.firstName[j]!=null){
                    firstName[i]=this.firstName[j];
                    lastName[i]=this.lastName[j];
                    group[i]=this.group[j];
                    rating[i]=this.rating[j];
                    attendance[i]=this.attendance[j];
                    i++;
                }
            }

        count=tempCount;

        this.firstName=new String[count];
        this.lastName=new String[count];
        this.group=new int[count];
        this.rating=new int[count];
        this.attendance=new int[count];

        for(int i=0;i<count;i++){
            this.firstName[i]=firstName[i];
            this.lastName[i]=lastName[i];
            this.group[i]=group[i];
            this.rating[i]=rating[i];
            this.attendance[i]=attendance[i];
        }

    }

    public void grouping(int inputGroup,int outputGroup){
        for(int i=0;i<count;i++){
            if(this.group[i]==inputGroup){
                this.group[i]=outputGroup;
            }
        }
    }

}
