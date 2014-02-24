package org.geoseeds.georonshou

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Tree)
class TreeSpec extends Specification {

    def setup() {
		mockDomain(User, [
			[name: "user1", location: 'aaa'],
			[name: "user2", location: 'bbb'],
			[name: "user3", location: 'ccc'] ])
		
		mockDomain(Context, [
			[name: "ctx1"],
			[name: "ctx2"],
			[name: "ctx3"] ])
		
		mockDomain(Tree, [
			[author: User.get(1), context: Context.get(1)],
			[author: User.get(2), context: Context.get(2)],
			[author: User.get(3), context: Context.get(3)] ])
		
		mockDomain(Node, [
			[author: User.get(1), content: 'ctaa', tree: Tree.get(1) ],
			[author: User.get(2), content: 'ctbb', tree: Tree.get(2) ],
			[author: User.get(3), content: 'ctcc', tree: Tree.get(3) ] ])
		
//		mockDomain(Score, [
//			[type: ScoreType.POSITIVE, scorable: Node.get(1), author: User.get(1)],
//			[type: ScoreType.DECONTEXTUALIZED, scorable: Node.get(1), author: User.get(2)],
//			[type: ScoreType.NEGATIVE, scorable: Node.get(1), author: User.get(3)] ])

		mockDomain(Score, [
			[type: ScoreType.POSITIVE, author: User.get(1)],
			[type: ScoreType.DECONTEXTUALIZED, author: User.get(2)],
			[type: ScoreType.NEGATIVE, author: User.get(3)] ])
    }

    def cleanup() {
    }

    void "test something"() {
		when: 'something'
		true
		
		then: 'blabla'
		true
    }
}
