package net.galacticraft.gradle.core.xml.model;

public class PluginConfiguration extends PluginContainer implements Cloneable
{
	private PluginManagement pluginManagement;

	public PluginConfiguration clone()
	{
		try
		{
			PluginConfiguration copy = (PluginConfiguration) super.clone();
			if (this.pluginManagement != null)
				copy.pluginManagement = this.pluginManagement.clone();
			return copy;
		} catch (Exception ex)
		{
			throw (RuntimeException) (new UnsupportedOperationException(getClass().getName() + " does not support clone()")).initCause(ex);
		}
	}

	public PluginManagement getPluginManagement()
	{
		return this.pluginManagement;
	}

	public void setPluginManagement(PluginManagement pluginManagement)
	{
		this.pluginManagement = pluginManagement;
	}
}