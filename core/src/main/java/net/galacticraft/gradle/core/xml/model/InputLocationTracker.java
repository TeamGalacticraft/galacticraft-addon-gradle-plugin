package net.galacticraft.gradle.core.xml.model;

public interface InputLocationTracker
{
	InputLocation getLocation(Object paramObject);

	void setLocation(Object paramObject, InputLocation paramInputLocation);
}