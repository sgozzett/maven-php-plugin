<?php

/**
 * The foo test class
 * 
 * @author mepeisen
 */
class FooTest extends PHPUnit_Framework_TestCase
{
	
	/**
	 * tests the bar function
	 */
	public function testFoo()
	{
		include "MyClass.php";
		$o = new MyMavenTestClass();
		$this->assertEquals("foo", $o->getFoo());
	}
	
}