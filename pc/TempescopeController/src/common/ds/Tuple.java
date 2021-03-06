package common.ds;

/*
 * Tuple.java - holds a tuple
 * 
 * Released as part of the Tempescope project - http://kenkawakenkenke.github.io/tempescope/
 * Copyright (c) 2013 Ken Kawamoto.  All right reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
public class Tuple<U, T> {
	public final U fst;
	public final T snd;
	
	public Tuple(U fst,T snd){
		this.fst=fst;
		this.snd=snd;
	}
	
	public String toString(){
		return fst+" "+snd;
	}
	
	public int hashCode(){
		return fst.hashCode()*snd.hashCode();
	}
	public boolean equals(Object other){
		Tuple<U,T> ot=(Tuple<U,T>)other;
		return fst.equals(ot.fst) && snd.equals(ot.snd);
	}
}
