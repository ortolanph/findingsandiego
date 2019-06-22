.phony: clean
JAR_FILE=sandiego.jar
CLASS_ALL_DATA=pho.findingsandiego.core.Sandbox
CLASS_LINEAR=pho.findingsandiego.linear.LinearSearchSandbox
CLASS_LINEAR_REFACTORED=pho.findingsandiego.linear.LinearSearchRefactoredSandbox
CLASS_FUNCTIONAL=pho.findingsandiego.functional.FunctionalSearchSandbox
CLASS_PREDICATE=pho.findingsandiego.functional.PredicateSearchSandbox
CLASS_BUILDER=pho.findingsandiego.functional.finder.BurglarFinder
CLASS_ERROR=pho.findingsandiego.functional.finder.BurglarFinderError
DATA_FILE=src/main/resources/carmensandiego.csv

clean:
	@mvn clean -q

compile: clean
	@mvn install -q

alldata: compile
	@java -cp target/$(JAR_FILE) $(CLASS_ALL_DATA) $(DATA_FILE)

linear: compile
	@java -cp target/$(JAR_FILE) $(CLASS_LINEAR) $(DATA_FILE)

linear-refactored: compile
	@java -cp target/$(JAR_FILE) $(CLASS_LINEAR_REFACTORED) $(DATA_FILE)

functional: compile
	@java -cp target/$(JAR_FILE) $(CLASS_FUNCTIONAL) $(DATA_FILE)

predicate: compile
	@java -cp target/$(JAR_FILE) $(CLASS_PREDICATE) $(DATA_FILE)

builder: compile
	@java -cp target/$(JAR_FILE) $(CLASS_BUILDER) $(DATA_FILE)

error: compile
	@java -cp target/$(JAR_FILE) $(CLASS_ERROR) $(DATA_FILE)