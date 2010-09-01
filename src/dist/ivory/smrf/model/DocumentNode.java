/*
 * Ivory: A Hadoop toolkit for web-scale information retrieval
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package ivory.smrf.model;

/**
 * <p>
 * Object representing a document node in a Markov Random Field.
 * <p>
 * 
 * @author Don Metzler
 * 
 */
public class DocumentNode extends GraphNode {

	protected int mDocno = 0;

	/**
	 * Returns the docno associated with this node.
	 */
	public int getDocno() {
		return mDocno;
	}

	/**
	 * Sets the docno associated with this node.
	 */
	public void setDocno(int docno) {
		mDocno = docno;
	}

	public int getType() {
		return DOCUMENT;
	}

	@Override
	public String toString() {
		return new StringBuilder("<node type=\"Document\" docid=\"").append(mDocno).append(
				"\" />\n").toString();
	}
}