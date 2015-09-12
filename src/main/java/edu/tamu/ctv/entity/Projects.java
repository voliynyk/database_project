package edu.tamu.ctv.entity;
// Generated Sep 6, 2015 12:46:57 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Projects generated by hbm2java
 */
public class Projects implements java.io.Serializable
{

	private Long id;
	private Projecttypes projecttypes;
	private Users users;
	private String code;
	private String name;
	private int access;
	private String notes;
	private Date registereddt;
	private Date lastvisitdt;
	private Set<Projectmanagers> projectmanagerses = new HashSet<Projectmanagers>(0);
	private Set<Projectreviewers> projectreviewerses = new HashSet<Projectreviewers>(0);
	private Set<Projectmembers> projectmemberses = new HashSet<Projectmembers>(0);
	private Set rowtypeses = new HashSet(0);
	private Set componentses = new HashSet(0);
	private Set columntypeses = new HashSet(0);
	private Set resultses = new HashSet(0);

	public Projects()
	{
	}

	public Projects(Long id, Projecttypes projecttypes, Users users, String code, String name, int access, Date registereddt, Date lastvisitdt)
	{
		this.id = id;
		this.projecttypes = projecttypes;
		this.users = users;
		this.code = code;
		this.name = name;
		this.access = access;
		this.registereddt = registereddt;
		this.lastvisitdt = lastvisitdt;
	}

	public Projects(Long id, Projecttypes projecttypes, Users users, String code, String name, int access, String notes, Date registereddt, Date lastvisitdt, Set projectmemberses, Set rowtypeses,
			Set componentses, Set columntypeses, Set resultses)
	{
		this.id = id;
		this.projecttypes = projecttypes;
		this.users = users;
		this.code = code;
		this.name = name;
		this.access = access;
		this.notes = notes;
		this.registereddt = registereddt;
		this.lastvisitdt = lastvisitdt;
		this.projectmemberses = projectmemberses;
		this.rowtypeses = rowtypeses;
		this.componentses = componentses;
		this.columntypeses = columntypeses;
		this.resultses = resultses;
		this.resultses = resultses;
	}
	
	public boolean isNew()
	{
		return null == id;
	}
	
	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Projecttypes getProjecttypes()
	{
		return this.projecttypes;
	}

	public void setProjecttypes(Projecttypes projecttypes)
	{
		this.projecttypes = projecttypes;
	}

	public Users getUsers()
	{
		return this.users;
	}

	public void setUsers(Users users)
	{
		this.users = users;
	}

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAccess()
	{
		return this.access;
	}

	public void setAccess(int access)
	{
		this.access = access;
	}

	public String getNotes()
	{
		return this.notes;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}

	public Date getRegistereddt()
	{
		return this.registereddt;
	}

	public void setRegistereddt(Date registereddt)
	{
		this.registereddt = registereddt;
	}

	public Date getLastvisitdt()
	{
		return this.lastvisitdt;
	}

	public void setLastvisitdt(Date lastvisitdt)
	{
		this.lastvisitdt = lastvisitdt;
	}

	public Set<Projectmanagers> getProjectmanagerses()
	{
		return this.projectmanagerses;
	}

	public void setProjectmanagerses(Set<Projectmanagers> projectmanagerses)
	{
		this.projectmanagerses = projectmanagerses;
	}
	
	public Set<Projectreviewers> getProjectreviewerses()
	{
		return this.projectreviewerses;
	}

	public void setProjectreviewerses(Set<Projectreviewers> projectreviewerses)
	{
		this.projectreviewerses = projectreviewerses;
	}
	
	public Set<Projectmembers> getProjectmemberses()
	{
		return this.projectmemberses;
	}

	public void setProjectmemberses(Set<Projectmembers> projectmemberses)
	{
		this.projectmemberses = projectmemberses;
	}
	
	public Set getRowtypeses()
	{
		return this.rowtypeses;
	}

	public void setRowtypeses(Set rowtypeses)
	{
		this.rowtypeses = rowtypeses;
	}
	
	public Set getComponentses()
	{
		return this.componentses;
	}

	public void setComponentses(Set componentses)
	{
		this.componentses = componentses;
	}

	public Set getColumntypeses()
	{
		return this.columntypeses;
	}

	public void setColumntypeses(Set columntypeses)
	{
		this.columntypeses = columntypeses;
	}

	public Set getResultses()
	{
		return this.resultses;
	}

	public void setResultses(Set resultses)
	{
		this.resultses = resultses;
	}

}
