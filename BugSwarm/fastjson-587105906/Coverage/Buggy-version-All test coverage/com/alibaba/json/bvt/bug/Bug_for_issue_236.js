var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":53135,"methods":[{"el":18,"sc":5,"sl":14}],"name":"Bug_for_issue_236","sl":12},{"el":23,"id":53139,"methods":[],"name":"Bug_for_issue_236.TestPara","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3290":{"methods":[{"sl":14}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [3290], [3290], [3290], [3290], [], [], [], [], [], [], []]
