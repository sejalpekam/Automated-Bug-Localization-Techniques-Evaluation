var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":64266,"methods":[{"el":24,"sc":5,"sl":9}],"name":"Issue1972","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2421":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":18},{"sl":20},{"sl":21},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2421], [2421], [2421], [2421], [2421], [], [2421], [2421], [], [2421], [], [2421], [2421], [], [2421], [], []]
