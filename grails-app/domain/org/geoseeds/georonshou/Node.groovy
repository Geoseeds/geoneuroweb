package org.geoseeds.georonshou

class Node implements Scorable, Contextualizable{

	User author
	String content
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [tree: Tree ]
	static hasMany = [ contexts: Context, children: Node, scores: Score]
	
	// http://grails.org/doc/2.3.x/guide/GORM.html#oneToMany
	
    static constraints = {
		author nullable: true
		contexts nullable: false
		content blank: false, unique: true, size: 1..140
		tree nullable: false
//		parent nullable: true
		children nullable: true
    }
	
	////////
	
	//returns the root node, and by extension, the entire tree!
//	Node getRootNode(){
//	   if(parent){
//		  //if parent is not null then by definition this node is a child node of the tree.
//		  return parent.getRootNode()
//	   }else{
//		  //if parent is null then by definition it is the root node.
//		  return this
//	   }
//	}
//
//	//you might not need this function, but ill add it as it is common in tree structures
//	boolean isLeaf(){
//	   //determines if this node is a leaf node. a leaf is a node with zero childrens
//	   return children.isEmpty()
//	}
}
