var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":37996,"methods":[{"el":18,"sc":5,"sl":14},{"el":23,"sc":5,"sl":20}],"name":"MethodTransformerNoOpTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4461":{"methods":[{"sl":20}],"name":"testObjectProperties","pass":true,"statements":[{"sl":22}]},"test_4488":{"methods":[{"sl":14}],"name":"testTransformation","pass":true,"statements":[{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4488], [], [4488], [4488], [], [], [4461], [], [4461], [], []]
