package com.TestCases;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.TestCases.Verify_ErrMsgs;

@RunWith(Suite.class)

@SuiteClasses({Validate_Login.class,Verify_ErrMsgs.class,})
public class RunTestSuite
{


}