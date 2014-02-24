package org.geoseeds.georonshou

class Score {
	
	ScoreType type
	Date dateCreated

	//The default cascading behaviour is to cascade saves and updates, but not deletes unless a belongsTo is also specified
	static belongsTo = Scorable
//	static belongsTo = [scorable: Scorable, author:User]
//	static belongsTo = [author:User]
	
    static constraints = {
		type nullable: false
    }
	
}
