package lesson12;

public class Family {
    private Human mother;
    private Human father;
    private Human[]  children;
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void addChild(Human child){
        
    }
    public void deleteChild(Human child){
        int indexToDelete = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == child) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            // Create a new array with one less element
            Human[] newArray = new Human[children.length - 1];
            int newIndex = 0;
            // Copy elements from the original array to the new array, skipping the element to delete
            for (int i = 0; i < children.length; i++) {
                if (i != indexToDelete) {
                    newArray[newIndex] = children[i];
                    newIndex++;
                }
            }
            // Assign the new array to the original array variable
            children = newArray;
        }


    }
}
