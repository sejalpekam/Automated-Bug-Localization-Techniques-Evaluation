var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":47924,"methods":[{"el":21,"sc":5,"sl":8}],"name":"WildcardTypeTest","sl":7},{"el":34,"id":47933,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31}],"name":"WildcardTypeTest.TestType","sl":23},{"el":38,"id":47936,"methods":[],"name":"WildcardTypeTest.TestType2","sl":36},{"el":46,"id":47936,"methods":[{"el":45,"sc":9,"sl":43}],"name":"WildcardTypeTest.A","sl":40},{"el":55,"id":47938,"methods":[{"el":54,"sc":9,"sl":51}],"name":"WildcardTypeTest.B","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_120":{"methods":[{"sl":8},{"sl":27},{"sl":31},{"sl":43},{"sl":51}],"name":"test_for_wildcardType","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":13},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":32},{"sl":44},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [120], [120], [120], [120], [], [120], [], [120], [], [120], [120], [], [120], [], [], [], [], [], [], [120], [], [], [], [120], [120], [], [], [], [], [], [], [], [], [], [], [120], [120], [], [], [], [], [], [], [120], [120], [120], [], [], []]
