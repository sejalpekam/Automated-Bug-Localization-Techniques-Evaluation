var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":56055,"methods":[{"el":20,"sc":5,"sl":12},{"el":30,"sc":5,"sl":22}],"name":"Issue1005","sl":11},{"el":34,"id":56069,"methods":[],"name":"Issue1005.Model","sl":32},{"el":38,"id":56069,"methods":[],"name":"Issue1005.Model2","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4081":{"methods":[{"sl":22}],"name":"test_for_List","pass":true,"statements":[{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_755":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [755], [755], [], [755], [755], [755], [755], [755], [], [], [4081], [4081], [], [4081], [4081], [4081], [4081], [4081], [], [], [], [], [], [], [], [], [], []]
