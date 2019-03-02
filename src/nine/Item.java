package nine;

import java.util.Objects;

public class Item implements Comparable {
    private String description;
    private int partNumber;

    public Item(String aDescription,int aPartNumber){
        description = aDescription;
        partNumber = aPartNumber;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description="+description+"'partNumber="+partNumber+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass()!=obj.getClass()) return false;
        Item other =(Item) obj;
        return Objects.equals(description,other.description) && partNumber ==other.partNumber;
    }

    public int hashCode(){
        return  Objects.hash(description,partNumber);
    }


    public int compareTo(Object o) {
        int diff = Integer.compare(partNumber,((Item)o).partNumber);
        return diff!=0?diff:description.compareTo(((Item)o).description);
    }
}
