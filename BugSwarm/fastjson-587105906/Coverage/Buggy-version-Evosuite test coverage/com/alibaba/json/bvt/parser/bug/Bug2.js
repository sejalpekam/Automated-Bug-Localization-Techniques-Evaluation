var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":73155,"methods":[{"el":19,"sc":5,"sl":13},{"el":27,"sc":5,"sl":21}],"name":"Bug2","sl":11},{"el":41,"id":73165,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"Bug2.Page","sl":29},{"el":54,"id":73169,"methods":[{"el":49,"sc":9,"sl":47},{"el":53,"sc":9,"sl":51}],"name":"Bug2.Result","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_241":{"methods":[{"sl":21}],"name":"test_1","pass":false,"statements":[{"sl":22},{"sl":23}]},"test_2505":{"methods":[{"sl":13},{"sl":33},{"sl":37}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":34},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2505], [2505], [2505], [2505], [], [2505], [], [], [241], [241], [241], [], [], [], [], [], [], [], [], [], [2505], [2505], [], [], [2505], [2505], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
