package com.cda.ilot.X.initial;

import java.util.LinkedList;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch.Diff;

public class InitialMain {

	public static void main(String[] args) {
		System.out.println("test");
		
		String text1 = "ABCDELMN";
		String text2 = "ABCFGLMN";
		DiffMatchPatch dmp = new DiffMatchPatch();
		LinkedList<Diff> diff = dmp.diffMain(text1, text2, false);
		
		System.out.println(diff);

	}

}
