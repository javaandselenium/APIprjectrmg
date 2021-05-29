package genericLib;

public class ProjectPojo {

	String projectName;
	String created_by;
	String status;
	public ProjectPojo(String projectName, String projectManager, String status) {
		super();
		this.projectName = projectName;
		this.created_by = projectManager;
		this.status = status;
	}
	
	public ProjectPojo() {}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectManager() {
		return created_by;
	}

	public void setProjectManager(String projectManager) {
		this.created_by= projectManager;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	}
