package EncapsulateCollection.Array.refactoryList;

import java.util.ArrayList;
import java.util.List;

public class Skill {
	List<String> skills = new ArrayList<String>();

	public void setSkill(int index, String newSkill) {
		skills.set(index, newSkill);
	}

	public String[] getSkills() {
		return skills.toArray(new String[0]);
	}
}
