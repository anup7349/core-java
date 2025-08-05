class Country{
private String name;
private int noOfStates;
private State[] states;
private String primeMinister;

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setStates(State[] states){
this.states=states;
}
public State[] getStates(){
return states;
}
public void setnoOfStates(int noOfStates){
this.noOfStates=noOfStates;
}
public int getnoOfStates(){
return noOfStates;
}
public void setprimeMinister(String primeMinister){
this.primeMinister=primeMinister;
}
public String getprimeMinister(){
return primeMinister;
}

}