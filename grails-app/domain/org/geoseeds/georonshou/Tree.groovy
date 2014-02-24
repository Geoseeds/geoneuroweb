package org.geoseeds.georonshou

class Tree implements Scorable, Contextualizable {

	User author
	Context context
	//automatic GORM fields: http://grails.org/doc/latest/guide/GORM.html#5.5.1%20Events%20and%20Auto%20Timestamping
	Date dateCreated
    Date lastUpdated
	
	static hasMany = [ roots: Node, scores: Score]
	
    static constraints = {
		author nullable: true
		context nullable: false, unique: true
    }
}
