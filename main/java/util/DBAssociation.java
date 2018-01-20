package util;

public class DBAssociation {

	String database;
	String datastore;
	String application;
	
	public DBAssociation(String database, String datastore, String application) {
		//super();
		this.database = database;
		this.datastore = datastore;
		this.application = application;
	}

	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getDatastore() {
		return datastore;
	}
	public void setDatastore(String datastore) {
		this.datastore = datastore;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DBAssociation)) {
			return false;
		}
		DBAssociation other = (DBAssociation) obj;
		if (database == null) {
			if (other.database != null) {
				return false;
			}
		} else if (!database.equals(other.database)) {
			return false;
		}
		if (datastore == null) {
			if (other.datastore != null) {
				return false;
			}
		} else if (!datastore.equals(other.datastore)) {
			return false;
		}
		return true;
	} 
	 
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((database == null) ? 0 : database.hashCode());
		result = prime * result
				+ ((datastore == null) ? 0 : datastore.hashCode());
		return result;
	} 
	
}
