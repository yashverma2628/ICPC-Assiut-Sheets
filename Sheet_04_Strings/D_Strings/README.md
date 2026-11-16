<h2><a href="https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/D">D. Strings</a></h2>
<h3>Sheet #4 (Strings) — ICPC Assiut University Community</h3>
<hr>

<p><strong>Time Limit:</strong> 2 seconds &nbsp;|&nbsp; <strong>Memory Limit:</strong> 64 megabytes</p>

<div><p>Given two strings <span class="tex-span"><i>A</i></span> and <span class="tex-span"><i>B</i></span>. Print three lines contain the following: </p><ul> <li> The size of the string <span class="tex-span"><i>A</i></span> and size of the string <span class="tex-span"><i>B</i></span> separated by a space </li><li> The string produced by <span class="tex-font-style-bf">concatenating</span> <span class="tex-span"><i>A</i></span> and <span class="tex-span"><i>B</i></span> <span class="tex-span">(<i>A</i> + <i>B</i>)</span>. </li><li> The two strings separated by a single space respectively, after <span class="tex-font-style-bf">swapping</span> their first character. </li></ul><p><span class="tex-font-style-bf">For more clarification see the example below.</span></p></div>

<h3>Input</h3>
<div class="section-title">Input</div><p>The first line contains a string <span class="tex-span"><i>A</i></span> <span class="tex-span">(1 ≤ |<i>A</i>| ≤ 10)</span> where |A| is the length of A.</p><p>The second line contains a string <span class="tex-span"><i>B</i></span> <span class="tex-span">(1 ≤ |<i>B</i>| ≤ 10)</span> where |B| is the length of B.</p>

<h3>Output</h3>
<div class="section-title">Output</div><p>Print the answer required above.</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
abcdef
<strong>Output:</strong>
4 2abcdefebcd af
</pre>

<h3>Note</h3>
<div class="section-title">Note</div><p><span class="tex-span"><i>Declaration</i>: </span></p><pre class="lstlisting"><code class="prettyprint nohighlight">string a = "abc";<br></code></pre><p><span class="tex-span"><i>Size</i>: </span></p><pre class="lstlisting"><code class="prettyprint nohighlight">int len = a.size();<br></code></pre><p><span class="tex-span"><i>Concatenate</i></span> <span class="tex-span"><i>two</i></span> <span class="tex-span"><i>strings</i>: </span></p><pre class="lstlisting"><code class="prettyprint nohighlight">string a = "abc";<br>string b = "def";<br>string c = a + b; // c = "abcdef".<br></code></pre><p><span class="tex-span"><i>Accessing</i></span> i <span class="tex-span"><i>element</i>: </span></p><pre class="lstlisting"><code class="prettyprint nohighlight">string s = "abc";<br>char   c0 = s[0];   // c0 = 'a'<br>char   c1 = s[1];   // c1 = 'b'<br>char   c2 = s[2];   // c2 = 'c'<br>s[0] = 'z';         // s = "zbc"<br></code></pre>
