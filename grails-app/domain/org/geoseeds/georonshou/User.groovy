package org.geoseeds.georonshou

class User implements Scorable{

	String name, location
	Date dateCreated
	
	static hasMany = [ trees: Tree, nodes: Node, scoresReceived: Score, scoresSent: Score]
//	static mappedBy = [scoresReceived:'scorable', scoresSent:'author']
	
	static mapping = {
		table 'appuser'
		//version false
		//addresses lazy: false
	}
	
    static constraints = {
		name size: 3..15, blank: false, unique: true
    }
}
