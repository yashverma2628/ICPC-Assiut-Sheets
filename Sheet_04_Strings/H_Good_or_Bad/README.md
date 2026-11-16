<h2><a href="https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/H">H. Good or Bad</a></h2>
<h3>Sheet #4 (Strings) — ICPC Assiut University Community</h3>
<hr>

<p><strong>Time Limit:</strong> 2 seconds &nbsp;|&nbsp; <strong>Memory Limit:</strong> 64 megabytes</p>

<div><p>Given a string <span class="tex-span"><i>S</i></span>. Determine whether this string is <span class="tex-font-style-bf">Good</span> or <span class="tex-font-style-bf">Bad</span>.</p><p><span class="tex-font-style-bf">Note:</span> The string is <span class="tex-font-style-bf">Good</span> if and only if it has "<span class="tex-font-style-bf">010</span>" or "<span class="tex-font-style-bf">101</span>" as one of its sub-strings and it's not necessary to have both of them.</p><p><span class="tex-font-style-bf">A substring</span> of a string is a contiguous subsequence of that string. So, string "forces" is substring of string "codeforces", but string "coder" is not.</p></div>

<h3>Input</h3>
<div class="section-title">Input</div><p>The first line contains a number <span class="tex-span"><i>T</i></span> <span class="tex-span">(1 ≤ <i>T</i> ≤ 100)</span> number of test cases. </p><p>Each of the <span class="tex-span"><i>T</i></span> following lines contains a string <span class="tex-span"><i>S</i></span> <span class="tex-span">(1 ≤ |<i>S</i>| ≤ 10<sup class="upper-index">5</sup>)</span> where |S| is the length of the string..</p><p><span class="tex-font-style-bf">It's guaranteed that <span class="tex-span"><i>S</i></span> contains only '1s' and '0s'.</span></p>

<h3>Output</h3>
<div class="section-title">Output</div><p>For each test case, print "<span class="tex-font-style-bf">Good</span>" if the string is <span class="tex-font-style-bf">Good</span> otherwise, print "<span class="tex-font-style-bf">Bad</span>".</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
21111111010101010101010
<strong>Output:</strong>
BadGood
</pre>

<h3>Note</h3>
<div class="section-title">Note</div><p>Example case 1:</p><p>The string doesn't contain <span class="tex-font-style-bf">010</span> or <span class="tex-font-style-bf">101</span> as sub-strings.</p><p>Example case 2:</p><p>The string contains both <span class="tex-font-style-bf">010</span> and <span class="tex-font-style-bf">101</span> as sub-strings.</p>
