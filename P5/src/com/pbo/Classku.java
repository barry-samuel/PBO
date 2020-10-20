package com.pbo;

class Classku {
	// Attribute
	public int x = 5; // Attribute ini boleh diakses secara langsung dari luar Classku
	int y = 15; // Attribute ini dapat diakses secara langsung dari luar Classku dalam 1 package
	private int z = 20; // Attribute ini tidak boleh diakses secara langsung dari luar Classku

	// Method
	public int tampilkanZ() {
		return this.z;
	}
}
