package EncapsulateCollection.Array.refactory;

public class Skill {
	String[] skills;

	public void setSkill(int index, String newSkill) {
		skills[index] = newSkill;
	}

	public void setSkills(String[] arg) {
		skills = new String[arg.length];
		for (int i = 0; i < arg.length; i++) {
			setSkill(i, arg[i]);
		}
	}

	public String[] getSkills() {
		String[] result = new String[skills.length];
		System.arraycopy(skills, 0, result, 0, skills.length);
		return result;
	}
	
	
}
