var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":60776,"methods":[{"el":20,"sc":5,"sl":11},{"el":31,"sc":5,"sl":22},{"el":42,"sc":5,"sl":33}],"name":"Issue1330_float","sl":10},{"el":46,"id":60797,"methods":[],"name":"Issue1330_float.Model","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3871":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":18},{"sl":19}]},"test_4272":{"methods":[{"sl":33}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":38},{"sl":40},{"sl":41}]},"test_4320":{"methods":[{"sl":22}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":27},{"sl":29},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3871], [3871], [3871], [3871], [], [3871], [], [3871], [3871], [], [], [4320], [4320], [4320], [4320], [], [4320], [], [4320], [4320], [], [], [4272], [4272], [4272], [4272], [], [4272], [], [4272], [4272], [], [], [], [], [], []]
