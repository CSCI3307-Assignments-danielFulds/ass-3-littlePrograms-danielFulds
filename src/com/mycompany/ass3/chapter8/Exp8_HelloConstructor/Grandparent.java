/**
 * 
 */
package com.mycompany.ass3.chapter8.Exp8_HelloConstructor;

/**
 * @author Dan Fulds
 *
 */
public class Grandparent implements HasName
{
	private float debt;
	private String lastName;
	private String name;

	public Grandparent() 
	{
		this(0, "oldMan", "grandPa");
	}
	
	public Grandparent(float debt, String _name, String _lastName) 
	{
		this.debt = debt;
		name = _name;
		lastName = _lastName;
	}

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public String getLastName() 
	{
		return lastName;
	}

	public float getDebt() 
	{
		return debt;
	}
}
