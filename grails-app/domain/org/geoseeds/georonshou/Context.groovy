package org.geoseeds.georonshou

class Context {

	String name
	Date dateCreated

	static belongsTo = Contextualizable
//	static hasMany = [contextualizable: Contextualizable]
		
    static constraints = {
		name blank: false, unique: true, size: 3..25
    }
}
