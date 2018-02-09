package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Roster{

	private List<Student> classRoster = new ArrayList<Student>();

	public List<Student> getClassRoster(){
		return classRoster;
	}

	public void addStudent(Student s){
		classRoster.add(s);
	}

	public void dropStudent(String name){
		for(int i=0;i<classRoster.size();i++){
			if(classRoster.get(i).getName().equals(name))
				classRoster.remove(i);
		}
	}

	public String toString(){
		String ret= "";
		
		ret+=classRoster.get(0).getName();
		for(int i =1; i<classRoster.size();i++){
			ret+= ", ";
			ret+=classRoster.get(i).getName();
		}
		return ret;
	}

	public void sortByID(){
		for (int i = 0; i<classRoster.size(); i++){
			for (int j = 1; j<classRoster.size()-i; j++){
				if(classRoster.get(j-1).getID() > classRoster.get(j).getID()){
                       		//swap elements
                       		Student temp = classRoster.get(j-1);
                       		classRoster.set(j-1,classRoster.get(j));
                      		classRoster.set(j,temp);
					}
                    		}

		}
	}

}




